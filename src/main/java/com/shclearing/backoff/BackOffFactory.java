package com.shclearing.backoff;

import com.github.rholder.retry.*;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.util.ExponentialBackOff;
import com.google.common.base.Predicates;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * User: changejava
 * Date: 2015/6/2
 * Time: 0:06
 */
public class BackOffFactory {


  public static void main(String[] args) throws IOException {
//    MockHttpTransport transport = new MockHttpTransport();
//    HttpRequest request =
//      transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
//    ExponentialBackOff build = new ExponentialBackOff.Builder()
//      .setInitialIntervalMillis(500)
//      .setMaxElapsedTimeMillis(900000)
//      .setMaxIntervalMillis(6000)
//      .setMultiplier(1.5)
//      .setRandomizationFactor(0.5)
//      .build();
//
//    HttpResponse httpResponse = request.execute();
    Callable<Boolean> yourTask = new Callable<Boolean>() {
      public Boolean call() throws Exception {
        System.err.println("RuntimeException " + Thread.currentThread());
        throw new RuntimeException("RuntimeException");
      }
    };

//    Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
//      .retryIfResult(Predicates.<Boolean>isNull())
//      .retryIfExceptionOfType(IOException.class)
//      .withWaitStrategy(WaitStrategies.fixedWait(3000, TimeUnit.MILLISECONDS))
//      .withStopStrategy(StopStrategies.stopAfterAttempt(10))
//      .build();

    Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
      .retryIfExceptionOfType(IOException.class)
      .retryIfRuntimeException()
      .withWaitStrategy(WaitStrategies.exponentialWait(100, 1, TimeUnit.SECONDS))
      .withStopStrategy(StopStrategies.stopAfterAttempt(3))
      .build();
    for (int i = 0, len = 1000000; i < len; i++) {
      try {
        retryer.call(yourTask);
      } catch (RetryException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      }
    }

  }
}
