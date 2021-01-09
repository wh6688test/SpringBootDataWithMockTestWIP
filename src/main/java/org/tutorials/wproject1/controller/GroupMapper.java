package org.tutorials.wproject1.controller;

import org.mapstruct.Mapper;
import org.tutorials.wproject1.model.Group;
import org.tutorials.wproject1.model.GroupDTO;
import org.tutorials.wproject1.model.Member;
import org.tutorials.wproject1.model.MemberDTO;

import java.util.List;
import java.util.SortedSet;

@Mapper
public interface GroupMapper {

    GroupDTO toGroupDTO(Group group1);
    List<GroupDTO> toGroupDTOs(List<Group> groups1);
    Group toGroup(GroupDTO groupDTO);
    List<Group> toGroupsList(List<GroupDTO> groupDTOs);


    MemberDTO toMemberDTO(Member member1);
    SortedSet<MemberDTO> toMemberDTOs(SortedSet<Member> members1);
    Member toMember(MemberDTO memberDTO);
    SortedSet<Member> toMembersList(SortedSet<MemberDTO> membersDTO1);
}
