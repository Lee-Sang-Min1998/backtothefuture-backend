package com.backtothefuture.event.dto.request;


import com.backtothefuture.event.annotation.NumericStringList;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

public record VerifyCertificateRequest(
        @Size(min = 3, max = 3, message = "핸드폰 번호를 올바르게 입력해 주세요.")
        @NumericStringList(message = "핸드폰 번호는 숫자만 입력할 수 있습니다.")
        List<String> phoneNumber,

        @Size(min = 6, max = 6, message = "인증번호는 6자리입니다.")
        @NotBlank(message = "인증번호는 필수 값입니다.")
        String certificationNumber
) {
    public String getPhoneNumber() {
        return String.join("", this.phoneNumber); } // 01012341234 형태로 변환
}
