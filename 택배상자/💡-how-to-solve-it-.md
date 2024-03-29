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

## [택배상자](https://school.programmers.co.kr/learn/courses/30/lessons/131704)
[0 ... n] 까지 순차적으로 보관되어 있는 택배 컨테이너와 FILO 구조의 컨테이너를 이용해 
int[] orders의 요소의 숫자대로 택배를 보내야할 때 최대 몇 개의 택배를 실어서 보낼 수 있는지 계산하는 문제 

### 1. 이해
- orders의 길이는 1과 같거나 크고 1,000,000과 같거나 작다 
- orders에는 oder.length의 길이 이하 모든 정수가 한번씩 등장한다 
- orders는 index 0부터 맞는 요소의 값을 넣어줘야한다. 
- 컨테이너는 0 부터 n까지 택배를 순서대로 보내준다
- 보관함은 나중에 집어넣은 택배 순서대로 택배를 꺼낼 수 있다
- 컨테이너 index 0 혹은 보관함에서 꺼낼 수 있는 택배가 orders[i]와 동일하다면 다음 택배를 넣을 수 있고 아니면 끝.

### 2. 계획
- 정수시퀀스를 반환하는 IntSequence를 생성한다. 
- int[] orders 값을 가진 Queue 자료구조를 생성한다.
- 택배를 임시로 보관할 수 있는 Stack 자료구조를 생성한다. 
- IntSequence.next() 값이 Queue peek 값과 같다면 Queue.poll, 같지 않다면 Stack.peek을 확인. 같다면 Stack.pop, Queue.poll, 같지 않다면 order.length - queue.size
- IntSequence.next() 값이 Queue peek 값과 같지 않다면 Stack.push() 같을 때 까지 반복. IntSequence.next()가 orders[i] 보다 크고 orders[i]가 queue.peek 과 같지 않다면 끝


### 3. 실행
- 

### 4. 반성
-
