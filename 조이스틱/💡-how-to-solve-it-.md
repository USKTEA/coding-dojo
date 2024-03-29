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

## [조이스틱](https://school.programmers.co.kr/learn/courses/30/lessons/42860)
만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 회수의 최솟값을 반환해라 

### 1. 이해
- 처음 문자열은 name의 길이만큼 알파벳 A로 이루어져있다
- 문자를 A > B , A > Z 로 변경할 수 있다. 
- 문자는 왼쪽으로 이동해서 마지막 문자를 고를 수 있고, 오른쪽으로 이동해서 2번째 문자를 고를 수 있다 
- 각 이동 및 변경마다 조작 횟수가 1만큼 증가한다 

### 2. 계획
- name의 길이만큼 알파벳 A로 이루어진 toChange 문자열을 반환하는 함수를 작성한다  
- toChange를 오른쪽으로 순회하면서 동일한 위치에 있는 name의 문자끼리 비교해서 최소 조작 횟수를 계산한다 
- 최소 조작 횟수는 Math.max(Math.abs(name[i] - toChange[i]), math.abs(name[i] - 'Z') + 1); 
- 매번 문자를 변경하고 name과 toChange가 같은지 비교한다. 같으면 조작 횟수 반환  
- toChange를 모두 순회하면 조작 횟수를 반환한다
### 3. 실행
- 

### 4. 반성
-
