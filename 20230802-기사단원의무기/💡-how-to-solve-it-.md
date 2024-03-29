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

## [기사단원의 무기](https://school.programmers.co.kr/learn/courses/30/lessons/136798)
1부터 number까지 숫자가 지정된 기사들이 있고, 기사는 자신의 숫자의 약수 개수에 해당하는 공격력을 가진 무기를 들 수 있다. 
하지만 협약에 따라 일정 공격력 수치 이상의 무기는 들지 못하고 초과된 무기를 드는 기사는 정해진 공격력의 무기를 들어야한다. 
공격력 1인 무기를 만드는데 철 1kg가 필요하다. 
총 몇 kg의 철이 필요한지 계산하라 

### 1. 이해
- 기사는 자기 자신의 숫자의 약수 개수만큼의 공격력을 가진 무기를 들 수 있다. 
- 약수 개수를 가진 공격력이 제한수치보다 높을 경우 정해진 공격력을 가진 무기를 들어야한다
- 철 1키로는 공격력 1을 가진 무기를 만들 수 있다. 

### 2. 계획
- 기사를 순회하며 약수의 개수를 계산한다. 
- 약수의 개수가 제한수치 보다 높을 경우 정해진 공격력을 대입한다. 
- 높지 않을 경우 그대로 사용한다
- 공격력의 합을 계산해 반환한다. 

### 3. 실행
- 

### 4. 반성
-
