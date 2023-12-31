package lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Configuration
//스프링부트앱 실행시 bean 자동생성.
public class MemberConfig {

	@Autowired
	MemberDTO dto; 
	/*다른 클래스
	 * @Autowired
	 * @Qualifier("memberInfo")
	 * String s;
	 * */
	@Bean("memberInfo")
	public String memberInfo() {
		dto.setMemberid("testid");
		System.out.println(dto.getMemberid());
		return dto.getMemberid();
	}
}
