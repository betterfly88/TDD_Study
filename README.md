## [스터디 진행 내용]
* 코드리뷰시 로직파악에 어려움으로 인해 통일성 있는 규약을 갖고 구조안에서 코딩하는 것이 좋을 것 같다. 2차 주제는 모여서 설계를 해서 코딩을 해보자. 
* 다음 과제부터는 기능 명세를 다함께 해서 전체적인 구조는 통일해서 가고 각자 기능을 구현하는 방식으로 진행합시다.
* 과제할 때는 TDD에 집중해서 TDD기준으로 코딩을 해나가면 좋을 것 같습니다. TDD 를 집중적으로 하고, 그 외의 관심있는 부분은 미니세미나에서 진행합시다. 
* 미니세미나는 과제가 끝나면 6명 각자 원하는 주제(평소 관심있었던거나 느낀점도 좋음)를 바탕으로 진행합시다. 
* 스터디 시간마친 후 점심식사하고 2시간정도 자율적인 공부시간을 가지면 좋을 것 같습니다. (평일에 시간을 자주 못 내니 함께 과제를 하다가 가면 좋을 것 같다는 의견)

## [피드백관련]
* 앞으로 피드백을 할 때 아래의 규칙을 기준으로 피드백해주세요.
   1.  규칙1) 프로그래밍 요구사항에 대해서 피드백이 들어가야 한다.
   2.  규칙2)  TDD시나리오 기준으로 확인한다. 
        - return값에 대해서 테스트가 되었는가 확인할 것. 
        - private메소드는 테스트코드를 작성하지 않아도 된다. public메소드만 테스트 코드를 작성해야한다. 
        - UI가 아닌 모든 코드는 테스트코드가 있어야 한다. 
        - exception까지 테스트 코드를 작성해주세요.
   3.  규칙3) public이 아닌 메소드들은 왜 이 접근제어자를 사용했는지 그 이유를 주석으로 꼭 달아주세요.
   4.  규칙4) getter/setter를 지양합시다. 상태값을 바꿀 때 생성자를 이용하거나 객체 자체에게 일을 시켜서 바꾸도록 노력합시다. 비지니스로직에서는 객체 자체에서 상태를 바꾸도록 객체에게 일을 시켜야 한다. controller에서는 getter/setter를 사용해도 됩니다.
   5.  규칙5) 의미있는 네이밍으로 명명하였는 지를 판단한다.
TEST
* 앞으로 1명의 소스코드만 피드백합니다.(피드백 대상자는 제비뽑기) 대신, 정해진 시간 안에 꼭 피드백을 주기로 하고 늦으면 하루 당 5000원씩 벌금을 매깁니다.
