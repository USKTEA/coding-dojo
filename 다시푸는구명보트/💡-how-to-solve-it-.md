### 1. 이해
> 아래의 질문에 대한 답변이 녹아 있어야 한다.

- [ ] 모르는 것은 무엇인가?
- [ ] 주어진 것은 무엇인가?
- [ ] 자료는 무엇인가?
- [ ] 조건은 무엇인가?
- [ ] 조건은 알아내야 하는 것을 찾는데 충분한가?

### 2. 계획
> A) 계획을 세우기 전에 아래와 같은 질문을 던지면 굉장히 유용하다.

- [ ] 관련된 문제를 알고 있는가?
- [ ] 모르는 부분이 유사한 다른 문제를 풀어 본 적이 있는가?
- [ ] 전에 풀어 본 문제를 활용하려면 어떤 보조 요소를 도입해야 되는가?
- [ ] 도움이 될 것 같은 어떤 사실이나 정리를 알고 있는가? (보통은 자료 구조나 수학적 공리 또는 정의가 해당됨)

> B) 계획을 세운 뒤 아래 질문을 통해 한번 더 점검해보자.

- [ ] 자료와 조건은 모두 활용 했는가? (Edge case가 될 조건을 꼭 확인해야 함)

### 3. 실행
> 코딩을 하는 단계! 무조건 Test case부터 먼저 작성해야 한다.
💡 TDD를 같이 하는 이유: Test code를 통해 각 단계가 올바르게 동작하는 것을 증명할 수 있다.

- [ ] 각 단계가 올바른지 명확히 알 수 있는가?
- [ ] 그것이 옳다는 것을 설명할 수 있는가?

### 4. 반성
> 문제를 다 풀고 나서 회고하는 시간을 갖는다. 반성한 부분을 다음 문제 풀이에 반영한다.

- [ ] 다른 방법으로 해결할 수는 없었는가? (이때 다른 사람의 풀이도 참고하면 좋음)
- [ ] 결과나 방법을 다른 문제에 활용할 수 있는가? (유용한 패턴은 따로 정리해두자)

## [구명보트](https://school.programmers.co.kr/learn/courses/30/lessons/42885?language=java)
제한된 인원과 무게만 담을 수 있는 구명보트를 최대한 적게 사용해 모든 사람을 구출하는 문제

### 1. 이해
- 보트는 최대 2명씩 탈 수 있다
- 보트는 40키로 부터 240키로 까지 담을 수 있다
- 무인도에 갇힌 사람은 1명 이상 50000명 이하이다
- 사람의 몸무게는 40키로 이상 240키로 이하이다
- 구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댃값보다 크게 주어진다.

### 2. 계획
- 모든 사람을 태워야 함으로 O(n)이 최선
- int[]people을 PriorityQueue에 집어넣는다.
- 보트에는 최대 2명이 탑승할 수 있으므로 priorityQuere를 순회하면서 가장 작은 값과 limit를 초과하지 않는 가장 큰 값을 제거하고 count += 1
- people priorityQueue size가 0일 때까지 반복하고
- people의 몸무게가 limit의 절반보다 크면 남은 priorityQueue의 size를 count에 더하고 반

### 3. 실행
- 

### 4. 반성
-
