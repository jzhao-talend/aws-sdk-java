/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import java.util.UUID;

/**
 * Annotation for auto-generating a {@link UUID}.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBGeneratedUuid(DynamoDBAutoGenerateStrategy.CREATE)
 * public UUID getKey()
 * </pre>
 *
 * <p>When applied to a key field, only the strategy
 * {@link DynamoDBAutoGenerateStrategy#CREATE} is supported.</p>
 *
 * <p>The short-formed {@link DynamoDBAutoGeneratedKey} may also be used for
 * create only.</p>
 *
 * <p>May be used as a meta-annotation.</p>
 *
 * @see java.util.UUID
 */
@DynamoDB
@DynamoDBAutoGenerated(generator=DynamoDBGeneratedUuid.Generator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBGeneratedUuid {

    /**
     * The auto-generation strategy.
     */
    DynamoDBAutoGenerateStrategy value();

    /**
     * Default generator.
     */
    static final class Generator<T> extends DynamoDBAutoGenerator.AbstractGenerator<T> {
        private final DynamoDBTypeConverter<T,UUID> converter;

        public Generator(Class<T> targetType, DynamoDBGeneratedUuid annotation) {
            super(annotation.value());
            this.converter = StandardTypeConverters.factory().getConverter(targetType, UUID.class);
        }

        @Override
        public final T generate(final T currentValue) {
            return converter.convert(UUID.randomUUID());
        }
    }

}
