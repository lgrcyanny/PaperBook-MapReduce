package com.paperbook.mapreduce.stat.secondarysort;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class NatualKeyPartitioner extends Partitioner<SortKeyPair, Text>{

	@Override
	public int getPartition(SortKeyPair key, Text value, int numPartitions) {
		return key.hashCode() % numPartitions;
	}

}
