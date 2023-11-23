package com.divit.springboot.application.util;

import java.util.List;
import java.util.Set;

import com.divit.springboot.application.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {
		var candidateList = List.of(
				new Candidate("Said chebbo", 220700, Set.of("c++", "sql", "c#")));

		return candidateList;
	}
}
