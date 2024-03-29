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

## [스킬트리](https://school.programmers.co.kr/learn/courses/30/lessons/49993)
skill 문자열과 skillTress 문자열 배열이 주어졌을 때 skillTrees 요소 중 skill 문자열 순서대로 되어있는 요소의 수를 계산해라   

### 1. 이해
- skill 문자열은 대문자 알파벳으로 이루어져있고 선행 스킬을 의미한다. 
- skill 문자열의 길이는 1 이상 26 이하이며, 중복된 스킬은 없다 
- skillTrees 의 길이는 1 이상 20 이하이며 요소 중 중복된 스킬은 없다 
- skill 문자열에 포함되어 있지 않은 스킬의 순서는 스킬트리에 영향을 주지 않는다  

### 2. 계획
- for 문을 돌며 skillTrees 요소와 skill을 비교하는 canILearn() 메서드를 작성한다. 
- canILearn 은 skillTrees 요소를 첫 번째 문자 부터 마지막 문자까지 순회하며 skill의 순서대로 되어있는지 판별하는 함수다 
- canILearn 은 skillTree요소의[0] ~ skillTree요소[i - 1]의 값이 skill[0] ~ skill[skill.index(skillTree[i])] 값과 비교하고 하나라도 존재하지 않다면 false를 반환한다 
- canILearn이 true라면 answer += 1 
- answer를 반환한다 

### 3. 실행
- 

### 4. 반성
-
