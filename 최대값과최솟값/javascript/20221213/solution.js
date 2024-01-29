const getAnswer = (word) => {
  const array = word.split(' ');

  return `${Math.min(...array)} ${Math.max(...array)}`;
};

export default getAnswer;
