package org.smssecure256.smssecure256;

import android.content.Context;
import android.test.InstrumentationTestCase;

public class SMSSecure256TestCase extends InstrumentationTestCase {

  @Override
  public void setUp() throws Exception {
    System.setProperty("dexmaker.dexcache", getInstrumentation().getTargetContext().getCacheDir().getPath());
  }

  protected Context getContext() {
    return getInstrumentation().getContext();
  }
}
