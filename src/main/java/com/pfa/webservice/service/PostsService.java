package com.pfa.webservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.webservice.domain.posts.PostsRepository;
import com.pfa.webservice.dto.posts.PostsMainResponseDto;
import com.pfa.webservice.dto.posts.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

/**
 * Created by pfa@gmail.com on 2017. 12. 27.
 * Blog : http://pfa.tistory.com
 * Github : https://github.com/pfa
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
