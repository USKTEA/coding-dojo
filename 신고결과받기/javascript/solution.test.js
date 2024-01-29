import { filterDuplicated, reportInformation } from './solution';

test('report 중복을 제거한다', () => {
  expect(filterDuplicated(['ryan con', 'ryan con', 'ryan con', 'ryan con']))
    .toEqual(['ryan con']);
});

test('중복이 제거된 report로 신고자와 신고받은자 명단을 만든다', () => {
  expect(reportInformation(['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi']))
    .toEqual([
      {
        muzi: ['frodo', 'neo'],
        apeach: ['fordo', 'muzi'],
        fordo: ['neo'],
      }, {
        frodo: 2,
        neo: 2,
        muzi: 1,
      }]);
});
