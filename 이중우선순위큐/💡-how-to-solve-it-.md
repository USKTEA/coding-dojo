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

## [이중우선순위큐](https://school.programmers.co.kr/learn/courses/30/lessons/42628)
명령이 operations 문자열 배열이 주어졌을 때 모든 명령을 수행하고 큐가 비어있으면 [0,0] 비어있지 않으면 [최대값, 최소값]을 반환하는 함수를 작성해라 

### 1. 이해
- I 숫자 - 큐에 숫자를 집어넣는다. D1 큐의 최대값 삭제, D-1 큐 최솟값 삭제 
- 빈 큐에 데이터를 삭제하는 연산이 주어질 경우 연산은 무시된다. 

### 2. 계획
- operations을 함수형 인터페이스로 변환한다.
- operation의 첫 글자가 I라면 add, D라면 삭제 그리고 1이면 가장 큰 숫자 삭제, -1면 가장 작은 숫자 삭제 
- 빈 Queue와 operation을 순회하고 Queue의 size()가 0 이면 [0,0] 반환 아니면 [first, last] 반환 

### 3. 실행
- 

### 4. 반성
-
