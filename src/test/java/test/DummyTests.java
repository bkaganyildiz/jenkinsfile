package test;

import org.junit.Test;
import sun.jvm.hotspot.utilities.AssertionFailure;

public class DummyTests {
  protected void run() {
    System.out.print("Hello");
  }

  @Test
  public void test1() throws Exception{
    assert(false);
  }

  @Test public void test2() {
    run();
  }

  @Test public void test3() {
    run();
  }

  @Test public void test4() {
    run();
  }

  @Test public void test5() {
    run();
  }

  @Test public void test6() {
    run();
  }

}
