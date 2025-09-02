package hofSequence.jmh;

import hofSequence.Hofstadter;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
public class SampleBenchmark {

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void sayHelloBenchmark(Blackhole bh) {
    Hofstadter hofstadter = new Hofstadter();
    int output = hofstadter.gSequence(1);
    bh.consume(output);
  }
}
