function solution(id_list, report, k) {
  const answer = [];
  const set = new Set();
  const count = {};
  const temp = {};

  for (let i = 0; i < id_list.length; i++) {
    answer[i] = 0;
  }

  report.forEach((e) => set.add(e));
  set.forEach((e) => {
    if (count[e.split(' ')[0]]) {
      count[e.split(' ')[0]].push(e.split(' ')[1]);
    } else {
      count[e.split(' ')[0]] = [e.split(' ')[1]];
    }
  });

  for (const [key, array] of Object.entries(count)) {
    for (const value of array) {
      if (temp[value]) {
        temp[value]++;
      } else {
        temp[value] = 1;
      }
    }
  }

  for (const [friends, lists] of Object.entries(count)) {
    for (const value of lists) {
      if (temp[value] >= k) {
        answer[id_list.indexOf(friends)]++;
      }
    }
  }

  return answer;
}
