... // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	... // Инициализируй поля класса в конструкторе
  }

  ... // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		... // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	... // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult();
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals(...);
	}
}