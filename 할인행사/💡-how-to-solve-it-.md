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

## [할인 행사](https://school.programmers.co.kr/learn/courses/30/lessons/131127)
10일 동안 원하는 만큼 할인된 상품 구매가 가능한 회원가입 날짜의 수를 반환하는 문제   

### 1. 이해
- 원하는 상품의 이름은 문자열 배열 want 이고 길이는 1 보다 크거나 가고 10 보다 작거나 같다
- 원하는 상품의 수량은 정수형 배열 number 이고 길이는 want 와 같다 
- 할인하는 품목의 은 문자열 배열 discount 이고 길이는 10 보다 크거나 같고 100,000 보다 작거나 같다 

### 2. 계획
- discount 배열을 index 0 부터 discount.length - 10까지 순회하며 구입 가능한 할인 상품 경우의 수를 만든다
- want와 number를 이용해 Product 리스트를 생성하고 구입 가능한 할인 상품 경우의 수와 일치하는 숫자를 반환한다.  

### 3. 실행
- 

### 4. 반성
-
