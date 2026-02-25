package com.dgw.mapper;

import com.dgw.dto.UserAccountDTO;
import com.dgw.user.account.domain.UserAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAccountDtoMapper {

    UserAccountDTO toUserAccountDTO(UserAccount userAccount);

    UserAccount toUserAccount(UserAccountDTO userAccountDTO);
}
