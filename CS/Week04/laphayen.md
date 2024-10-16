# 네트워크 - 2

## 1. 물리 계층

**질문:**
물리 계층에서 발생할 수 있는 주요 오류와 이를 해결하는 방법은 무엇인가요?

**예상 답변:**

- 원인 : 물리 계층에서 발생하는 주요 오류는 신호 감쇠, 노이즈, 간섭, 전송 매체 손상 등이 있습니다.

- 신호 감소는 거리가 멀어질수록 신호가 약해지는 현상으로, 리피터나 증폭기를 사용해서 해결합니다.

- 노이즈와 간섭은 주변 환경으로 발생하기 때문에, 차폐 케이블을 사용하거나, 무선 전송의 경우는 주파수 대역 관리로 해결합니다.


## 2. 데이터 링크 계층
**질문:**
CSMA/CD와 CSMA/CA의 차이를 설명하세요.

**예상 답변:**
- CSMA/CD(Carrier Sense Multiple Access with Collision Detection)는 유선 네트워크에서 충돌을 감지하고 충돌이 발생하면 전송을 중단하고 일정 시간 후 재전송하는 방식입니다. 주로 이더넷에서 사용됩니다.
 
- CSMA/CA(Carrier Sense Multiple Access with Collision Avoidance)는 무선 네트워크에서 충돌을 방지하는 방식으로, 충돌을 피하기 위해 데이터를 전송하기 전에 네트워크 상태를 확인하고, 전송을 시작하기 전에 전송할 수 있다는 신호를 기다립니다. 주로 Wi-Fi 네트워크에서 사용됩니다.


## 3. 데이터 링크 계층

**질문:**
데이터 링크 계층에서 사용하는 MAC 주소와 IP 주소의 차이점은 무엇인가요?

**예상 답변:**
- MAC 주소는 네트워크 인터페이스 카드(NIC)에 고유하게 부여되는 하드웨어 주소로, 데이터 링크 계층에서 사용되며, 동일한 네트워크 내에서 장치를 식별합니다.

- IP 주소는 네트워크 계층에서 사용되며, 논리적으로 네트워크와 호스트를 식별하는 주소입니다.

- MAC 주소는 물리적이고 고정된 반면, IP 주소는 네트워크에 연결될 때마다 변경될 수 있습니다.

