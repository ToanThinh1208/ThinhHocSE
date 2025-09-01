//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //comment: ghi chú
            /*
            datatype: kiểu dữ liệu
            trong java có 2 dạng dữ liệu
            1. primitive datatype: kiểu dữ liệu nguyên thủy
            dùng 1 lượng nhỏ vùng nhớ để lưu trữ dữ liệu
            và vì quá nhỏ nên k thể tách nhỏ hơn đc nữa
                1 - byte        1 byte(8bit)  số nguyên rất rất nhỏ
                // LƯU GIỮ 0 TỚI 255 KÍ TỰ BẢNG MÃ ASCII 256
                //lưu max đc 7 thằng và 1 thg +- tức là -128 tới 127 tính cả 0
                2 - short       2 byte(16bit) số nguyên rất nhỏ
                3 - int         4 byte(32bit) số nguyên nhỏ
                4 - long        8 byte(64bit) số nguyên lớn
                5 - float       4 byte(       số thực nhỏ
                6 - double      8 byte        số thực lớn
                7 - char        2 byte        ký tự - unicode do lưu thêm dấu nên 2 byte
                8 - boolean     1 bit là 0/1  true | false
                //int a; thì a là rác nhưng trong java nó sẽ mặc định là 0 (false)
            GC:  garbage collection
            default value initial: giá trị mặc định lúc khởi tạo
            //tất cả đều là số 0

            2. Object datatype | references datatype:
            gọi là kiểu dữ liệu do người dùng tự định nghĩa
            bằng các primitive có sẵn
            Student(name-char-string, yob-int, gpa-float)

            3. Operator: toán tử
            Java có ít nhất 10 loại toán tử
                1. Athrimetic: toán tử!= toán hạng
                + - * / % ++ -- += -= /= *= %=
                2. comparision: toán tử so sánh
                > < >= <= == !=
                3. logical: toán tử logic
                   && || & |
                   &&: tìm false, gặp false ngừng, kết luận false
                   ||: tìm true, gặp true ngừng, kết luận true
                4. string
                5. unary: 1 ngôi
                6. comma: phẩy
                7. ternary: toán tử 3 ngôi ? :
                8. shift bit: toán tử dịch bit
                    << >>
                9. bitwise: toán tử bit (& | ^ ~)
                                        and or xor not
                &: tìm 0; kết luận 0 (false)
                |: tìm 1, kết luận 1 (true)
                ^: khác thì 1, giống thì 0 so le
                ~: not, phủ định
            */

                /*
        CLASS có thể nhận 1 CLASS khác làm con
        có thể rót nguyên liệu và đúc ra object (công việc)
        Modifier: bỗ nghĩa
        1 - access modifier
            + default: cho phép cùng package truy cập
                    khác package thì không thấy gì hết
            + public: phạm vi truy cập lớn nhất, ai cũng thấy mình
                    khác package cũng được
            + private: riêng tư, không ai có thể truy cập vào được lun
            + protected: giống public nhưng chỉ những người con mới có thể thấy
        2 - non- access modifier
            + final: áp dụng cho class, prop, method
                    class: đó k nhận con, vẫn tạo được object
                    prop: hằng số
                    method: cho kế thừa nhưng ko override
            + static: tĩnh lặng | đứng yên
                áp dụng cho prop và method
                ám chỉ việc nó là bản thể duy nhất, k phân thân
                và thuộc sở hữu của class(khuôn) | lò luyện gà
                và object k đc sở hữu nhưng được quyền xài
            + abstract: trừu tượng
            --------------------------------------------------------------------------------
            [Quy tắc lưu trữ và quản lý]
            muốn quản lý nhiều đối tượng thì cần bỏ chúng vào mảng
            nhưng mảng chỉ chấp nhận những thằng cùng kiểu
            vậy tức là mình phải chứng minh rằng bọn object mà mình muốn quản lý là cùng một
            kiểu
            B1 > đặt 2 đối tượng (object) bất kỳ lên bàn cân > tìm điểm chung > tạo ra
            cái khuôn (class) > nói rằng chỉ cần rót nguyên liệu, tao có thể tạo ra sơn tùng,
            chipuc,... vậy nên
            bọn chúng là cùng một khuôn mà ra  > cùng kiểu > phải nhét đc vào mảng
            class có 2 thg thuộc tính (properties) và method

            class bình thường mà chứa abstract method thì class đó phải là abstract class
             1 abstract class thì ko nhất thiết phải có abstract method
            */
        //ta có 2 class cha và class con
        //hỏi? object của cha to hơn hay object của con to hơn => con
        //vì con kế thừa tất cả của cha và nó còn mở rộng = mấy cái hàm độ
        //hàm riêng
        //nguyên tắc bất hiếu: cha cho con hết những gì cha có.
        //con thì không, và con còn có những hàm riêng
        //Override: vượt mặt
        //chỉ xuất hiện trong mqh "cha con - kế thừa - is a"
        //khi mà thằng con độ lại hàm của thằng cha
        //tạo ra 1 thg mới cùng tên với hàm của cha khác para hoặc body

        //Overload: ko quan tâm quan hệ
        //khi mà method này cùng tên với method khác
        //nhưng khác nhau về para và body
    }
}