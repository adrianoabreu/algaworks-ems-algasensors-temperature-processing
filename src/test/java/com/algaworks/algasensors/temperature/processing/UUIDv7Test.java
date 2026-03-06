package com.algaworks.algasensors.temperature.processing;

import com.algaworks.algasensors.temperature.processing.common.IdGenerator;
import com.algaworks.algasensors.temperature.processing.common.UUIDb7Utils;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
//import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shoudGenerateUUIDv7(){
/*      UUID uuid1 = IdGenerator.generateTimeBasedUUID();
        UUID uuid2 = IdGenerator.generateTimeBasedUUID();
        UUID uuid3 = IdGenerator.generateTimeBasedUUID();
        UUID uuid4 = IdGenerator.generateTimeBasedUUID();

        System.out.println(UUIDb7Utils.extractOffsetDateTime(uuid1));
        System.out.println(UUIDb7Utils.extractOffsetDateTime(uuid2));
        System.out.println(UUIDb7Utils.extractOffsetDateTime(uuid3));
        System.out.println(UUIDb7Utils.extractOffsetDateTime(uuid4));
*/
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidDateTime = UUIDb7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);
    }
}
