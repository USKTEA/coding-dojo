export const toMap = (participants) =>
  participants.reduce((acc, participant) => {
    if (acc.has(participant)) {
      acc.set(participant, acc.get(participant) + 1);

      return acc;
    }

    acc.set(participant, 1);

    return acc;
  }, new Map());

export const getNotCompleted = (participant, completions) => {
  return completions.reduce((participants, completion) => {
    if (participants.get(completion) > 0) {
      participant.set(completion, participant.get(completion) - 1);
    }

    if (participant.get(completion) === 0) {
      participants.delete(completion);
    }

    return participants;
  }, participant);
};

export const getName = (notCompleted) => {
  return notCompleted.keys().next().value;
};

export const solution = (participant, completion) => {
  const participants = toMap(participant);
  const notCompleted = getNotCompleted(participants, completion);
  const notCompletedName = getName(notCompleted);

  return notCompletedName;
};
