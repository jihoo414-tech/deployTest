package com.back.railwaytest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test-members")
public class TestMemberController {
    private final TestMemberRepository testMemberRepository;
    @PostMapping
    public TestMember create(){
        return testMemberRepository.save(new TestMember("지후"));
    }
    @GetMapping
    public List<TestMember> findAll(){
        return testMemberRepository.findAll();
    }
}
