function solution(participant, completion) {
  const sortedParticipant = participant.sort();
  const sortedCompletion = completion.sort();

  const answer = sortedParticipant.filter((i, index) => i !== sortedCompletion[index])[0];

  return answer;
}
