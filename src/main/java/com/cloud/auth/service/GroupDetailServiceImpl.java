package com.cloud.auth.service;

import com.cloud.auth.entity.Group;
import com.cloud.auth.entity.GroupDetail;
import com.cloud.auth.repository.GroupDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GroupDetailServiceImpl implements GroupDetailService{

    private final GroupDetailRepository groupDetailRepository;

    public GroupDetail getOneGroupDetail(Integer groupId) {
        GroupDetail groupDetail = groupDetailRepository.findByGroupId(groupId);
        return groupDetail;
    }
}
