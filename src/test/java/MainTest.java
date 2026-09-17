import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testCalculateBMI() {
        // 測試身高 175 公分、體重 70 公斤的 BMI 計算結果
        double bmi = Main.calculateBMI(175.0, 70.0);
        // 允許 0.01 的誤差範圍
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    void testDetermineStatus() {
        // 測試不同 BMI 區間的狀態判定
        assertEquals("體重過輕", Main.determineStatus(17.0));
        assertEquals("正常範圍", Main.determineStatus(21.5));
        assertEquals("過重", Main.determineStatus(25.5));
        assertEquals("肥胖", Main.determineStatus(28.0));
    }
}