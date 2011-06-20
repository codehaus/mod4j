package org.company.recordshop.service.dto.translators;

import junit.framework.Assert;

import org.company.recordshop.bd.domain.RecordTypeEnum;
import org.company.recordshop.service.dto.RecordTypeEnumDto;
import org.junit.Test;

public class RecordTypeEnumDtoTranslatorTest {

    private RecordTypeEnumDtoTranslator translator = RecordTypeEnumDtoTranslator.getInstance();

    @Test
    public void testFromDto() {
        Assert.assertSame(RecordTypeEnum.BLUERAY, translator.fromDto(RecordTypeEnumDto.BLUERAY));
        Assert.assertSame(RecordTypeEnum.CD, translator.fromDto(RecordTypeEnumDto.CD));
    }

    @Test
    public void testToDto() {
        Assert.assertSame(RecordTypeEnumDto.BLUERAY, translator.toDto(RecordTypeEnum.BLUERAY));
        Assert.assertSame(RecordTypeEnumDto.CD, translator.toDto(RecordTypeEnum.CD));
    }

}
