function solution(s) {
  const input = s.split(' ');
  const answer = input
    .map((num) =>
      num
        .split('')
        .map((number, index) => {
          if (index % 2 === 0) {
            return number.toUpperCase();
          }

          if (index % 2 === 1) {
            return number.toLowerCase();
          }
        })
        .join(''),
    )
    .join(' ');

  return answer;
}
