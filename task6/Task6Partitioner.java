package mapreduce.demo.task6;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class Task6Partitioner extends Partitioner<IntWritable, IntWritable> {

	@Override
	public int getPartition(IntWritable key, IntWritable value, int numPartitions) {			
		if (key.get() <= 1990) {
			return 0;
		}
		else {
			return 1;
		}
	}
}