package com.tit.day02.votingsystem;

public class VotingSystemMain {

    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        // Casting votes
        voting.castVote("Darshan");
        voting.castVote("Rajveer");
        voting.castVote("Aditya");
        voting.castVote("Ankit");
        voting.castVote("Rajveer");
        voting.castVote("Aditya");

        // Display sorted results
        voting.displayResultsSorted(); // Output: {Alice=3, Bob=2, Charlie=1}

        // Display votes in order of voting
        voting.displayVotingOrder(); // Output: {Alice=3, Bob=2, Charlie=1}
    }
}
