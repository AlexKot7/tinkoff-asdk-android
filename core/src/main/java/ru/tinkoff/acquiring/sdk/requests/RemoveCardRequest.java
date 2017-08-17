/*
 * Copyright © 2016 Tinkoff Bank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.tinkoff.acquiring.sdk.requests;

import java.util.Map;

/**
 * @author Mikhail Artemyev
 */
final public class RemoveCardRequest extends AcquiringRequest {

    private String cardId;
    private String customerKey;

    public RemoveCardRequest() {
        super("RemoveCard");
    }

    @Override
    public Map<String, Object> asMap() {
        final Map<String, Object> map = super.asMap();

        putIfNotNull(CARD_ID, cardId, map);
        putIfNotNull(CUSTOMER_KEY, customerKey, map);

        return map;
    }

    public String getCardId() {
        return cardId;
    }

    void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCustomerKey() {
        return customerKey;
    }

    void setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
    }
}
