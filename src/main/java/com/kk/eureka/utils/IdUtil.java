package com.kk.eureka.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 获取主键ID
 *
 */
public class IdUtil {


  /**获取系统生成的16位ID
   * @return 16位id
   */
  public static String getUID() {
    // mongodb objectId
    final int time = (int) (System.currentTimeMillis() / 1000);
    final int inc = nextInc.getAndIncrement();

    byte[] b = new byte[12];
    ByteBuffer bb = ByteBuffer.wrap(b);
    bb.putInt(time);
    bb.putInt(GEN_MACHINE);
    bb.putInt(inc);
    return Base64.encodeBase64URLSafeString(b);
  }

  public static void main(String[] args) throws Exception {
    String abc = Base64.encodeBase64String("我ai".getBytes());
    System.out.println(abc);
    System.out.println(new String(Base64.decodeBase64(abc)));
  }

  private static AtomicInteger nextInc = new AtomicInteger((new Random()).nextInt());
  private static final int GEN_MACHINE;

  static {

    try {
      int machinePiece;
      {
        try {
          StringBuilder sb = new StringBuilder();
          Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
          while (e.hasMoreElements()) {
            NetworkInterface ni = e.nextElement();
            sb.append(ni.toString());
          }
          machinePiece = sb.toString().hashCode() << 16;
        } catch (Throwable e) {
          machinePiece = (new Random().nextInt()) << 16;
        }
      }

      final int processPiece;
      {
        int processId = new Random().nextInt();
        try {
          processId = java.lang.management.ManagementFactory.getRuntimeMXBean().getName().hashCode();
        } catch (Throwable t) {
        }

        ClassLoader loader = IdUtil.class.getClassLoader();
        int loaderId = loader != null ? System.identityHashCode(loader) : 0;

        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(processId));
        sb.append(Integer.toHexString(loaderId));
        processPiece = sb.toString().hashCode() & 0xFFFF;
      }

      GEN_MACHINE = machinePiece | processPiece;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }
}
