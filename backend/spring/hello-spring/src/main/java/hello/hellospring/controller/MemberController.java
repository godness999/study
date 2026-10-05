package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class MemberController {

    @Controller
    public class HelloController {

        private final MemberService memberService;

        @Autowired
        public HelloController(MemberService memberService) {
            this.memberService = memberService;
        }
    }
}
