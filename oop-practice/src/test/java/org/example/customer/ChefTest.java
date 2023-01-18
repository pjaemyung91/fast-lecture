package org.example.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChefTest {
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void cookingTest() {
        Chef chef = new Chef();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook = chef.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
