package com.tit.day02.votingsystem;

import java.util.*;

public class VotingSystem
{
    private Map<String, Integer> votesMap;         // Stores candidate votes (HashMap)
    private Map<String, Integer> voteOrderMap;     // Maintains voting order (LinkedHashMap)

    public VotingSystem()
    {
        votesMap = new HashMap<>();
        voteOrderMap = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate)
    {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, votesMap.get(candidate)); // Update order of voting
    }

    // Display results in sorted order
    public void displayResultsSorted()
    {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(votesMap);
        System.out.println("Election Results (Sorted Order): " + sortedResults);
    }

    // Display voting order
    public void displayVotingOrder()
    {
        System.out.println("Voting Order: " + voteOrderMap);
    }
}