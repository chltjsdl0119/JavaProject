import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainMenu {

    List<FoodMenu> burgerMenu = new ArrayList<>();
    List<FoodMenu> frozenCustardMenu = new ArrayList<>();
    List<FoodMenu> drinkMenu = new ArrayList<>();
    List<FoodMenu> beerMenu = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public MainMenu() {
        burgerMenu.add(new FoodMenu("Shack Burger", "6,900원", "토마토와 양상추가 들어간 치즈버거"));
        burgerMenu.add(new FoodMenu("Smoke Shack", "8,900원", "베이컨, 제리 패퍼가 토핑된 치즈버거"));
        burgerMenu.add(new FoodMenu("Shroom Burger", "9,400원", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));

        frozenCustardMenu.add(new FoodMenu("Shake of the Week", "6,500원", "특별한 커스터드 플레이버"));
        frozenCustardMenu.add(new FoodMenu("Red Bean Shake", "6,500원", "신선한 커스터드와 함께 우유와 레드빈이 들어간 시즈널 쉐이크"));
        frozenCustardMenu.add(new FoodMenu("Floats", "5,900원", "루트 비어, 퍼플 카우, 크림시클"));

//        drinkMenu.add(new FoodMenu());
//        drinkMenu.add(new FoodMenu());
//        drinkMenu.add(new FoodMenu());
//
//        beerMenu.add(new FoodMenu());
//        beerMenu.add(new FoodMenu());
//        beerMenu.add(new FoodMenu());
    }

    public void showMainMenu() {
        System.out.println("ShakeShack Burger");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ ShakeShack Burger Menu ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져 만든 버거");
        System.out.println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println("[ Order Menu ]");
        System.out.println("5. Order           | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel          | 진행 중인 주문을 취소합니다.");

        System.out.println("메뉴 선택 : ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:


//            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
