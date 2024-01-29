export const solution = (citations) => {
  const sorted = sort(citations);

  return getHIndex(sorted);
}

export const sort = (citations) => {
  return [...citations].sort((a, b) => a - b);
}

export const getHIndex = (sortedCitations, index = 0) => {
  if (sortedCitations[index] >= sortedCitations.length - index) {
    return sortedCitations.length - index;
  }

  if (index === sortedCitations.length) {
    return 0;
  }
 
  return getHIndex(sortedCitations, index + 1)
}
