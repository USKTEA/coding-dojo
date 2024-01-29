function solution(string, number) {
  return encrypt(string, number);
}

export const split = (string) => {
  return string.split('');
};

export const push = (letter, number) => {
  const asciiCode = letter.charCodeAt(0);
  const lowerCaseEnd = 'z'.charCodeAt(0);
  const upperCaseEnd = 'Z'.charCodeAt(0);

  if (letter === ' ') {
    return ' ';
  }

  if (asciiCode + number > upperCaseEnd && asciiCode <= upperCaseEnd) {
    return String.fromCharCode(asciiCode + number - 26);
  }

  if (asciiCode + number > lowerCaseEnd) {
    return String.fromCharCode(asciiCode + number - 26);
  }

  return String.fromCharCode(asciiCode + number);
};

export const encrypt = (string, number) => {
  return split(string).reduce(
    (string, letter) => string + push(letter, number),
    '',
  );
};

export const isBlank = (string) => {
  return string === ' ';
};
