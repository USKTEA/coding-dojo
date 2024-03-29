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

## [모음사전](https://school.programmers.co.kr/learn/courses/30/lessons/84512)
AEIOU로만 이루어진 문자열 word가 주어졌을 때 사전에서 몇 번째 단어인지 반환하는 함수를 작성하는 문제  

### 1. 이해
- 사전은 A,E,I,O,U 로만 구성되어 있는 단어로 이루어져있다
- 단어의 길이는 1 이상 5 이하이다
- 첫 단어는 "A" 이고 마지막 단어는 "UUUUU" 이다

### 2. 계획
- 사전의 첫 번째 단어부터 word와 동일한 문자를 찾을 때 까지 순서대로 단어를 찾는다 
- 단어를 찾을 때 A,E,I,O,U 순서가 되며 AAAAA는 5이고 AAAAE는 6이다. 
- 단어는 5글자 미만이라면 5글자가 되도록 A를 채운다. 
- 단어가 U에서 다음 단어로 넘어갈 때 올림이 발생하며 올림이 발생하면 해당 자리수는 없어지며 윗 자리수의 숫자는 올림이 발생한다. 
- A -> AA -> AAA -> AAAA -> AAAAA -> AAAAE -> (...) -> AAAE -> AAAEA -> AUUUU -> E -> EA 

### 3. 실행
- 

### 4. 반성
-
