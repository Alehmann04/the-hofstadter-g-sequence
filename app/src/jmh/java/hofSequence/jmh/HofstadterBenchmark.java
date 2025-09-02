package hofSequence.jmh;

import hofSequence.ImprovedHofstadter;
import hofSequence.NaiveHofstadter;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
public class HofstadterBenchmark {

  int[] ns = { 10, 5, 0, 7, 8, 10, 5, 6, 34 };

  @Benchmark
  public void naiveBenchmark(Blackhole bh) {
    NaiveHofstadter hofstadter = new NaiveHofstadter();
    for (int n : ns) {
      int result = hofstadter.gSequence(n);
      bh.consume(result);
    }
  }

  @Benchmark
  public void improvedBenchmark(Blackhole bh) {
    ImprovedHofstadter hofstadter = new ImprovedHofstadter();
    for (int n : ns) {
      int result = hofstadter.gSequence(n);
      bh.consume(result);
    }
  }
}
