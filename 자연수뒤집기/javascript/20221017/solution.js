export const toArray = (number) => {
  return number.toString().split("").map(number => parseInt(number))
};

export const reverse = (array) => {
  return array.reverse();
}

export default function solution(number) {
  return reverse(toArray(number));
};
