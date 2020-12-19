import java.util.Scanner;

public class Program {
    //    static ManagerBook booksList = new ManagerBook();
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Books[] books = new Books[10];
        FictionBooks fictionBooks1 = new FictionBooks("KA123", "SachJava", 10, "NoName", "Lap Trinh");
        FictionBooks fictionBooks2 = new FictionBooks("KA113", "SachJava", 9, "NoName", "Lap Trinh");
        FictionBooks fictionBooks3 = new FictionBooks("KA121", "SachJava", 8, "NoName", "Lap Trinh");
        FictionBooks fictionBooks4 = new FictionBooks("KA143", "SachJava", 7, "NoName", "Lap Trinh");
        FictionBooks fictionBooks5 = new FictionBooks("KA127", "SachJava", 6, "NoName", "Lap Trinh");
        books[0] = fictionBooks1;
        books[1] = fictionBooks2;
        books[2] = fictionBooks3;
        books[3] = fictionBooks4;
        books[4] = fictionBooks5;
        ProgrammingBooks programmingBooks1 = new ProgrammingBooks("KA123", "SachJava", 5, "NoName", "Java", "Noname");
        ProgrammingBooks programmingBooks2 = new ProgrammingBooks("KA113", "SachJava", 4, "NoName", "Java", "Noname");
        ProgrammingBooks programmingBooks3 = new ProgrammingBooks("KA133", "SachJava", 3, "NoName", "Java", "Noname");
        ProgrammingBooks programmingBooks4 = new ProgrammingBooks("KA153", "SachJava", 2, "NoName", "Java", "Noname");
        ProgrammingBooks programmingBooks5 = new ProgrammingBooks("KA163", "SachJava", 1, "NoName", "Java", "Noname");
        books[5] = programmingBooks1;
        books[6] = programmingBooks2;
        books[7] = programmingBooks3;
        books[8] = programmingBooks4;
        books[9] = programmingBooks5;
        totalMoney(books);
//        InsertionSort(books);
        BubbleSort(books);
        for (var book : books) {
            System.out.println(book.toString());
        }
//        Binarysearch(books);
        searNameJava(books);
        System.out.println("Nhập Giá Muốn Tìm");
        var x = input.nextInt();
        searPrice(books, x);


        System.out.println("Tìm Kiếm Vi Trí Sách Binary Search ");
        System.out.println("Nhập Vị Trí Muốn Tìm");
        var x1 = input.nextInt();
        var result = binarySearch(books, x1);
        if (result == -1) {
            System.out.println("Phần Tử Không Tồn Tại");
        } else {
            System.out.println("Phần Tử Tại Ví idex " + result);
        }
    }

    /**
     * Phương thức tìm kiếm vị trí sách trong mảng book
     *
     * @param books mảng books
     * @param x1    Giá muốn tìm
     * @return kết quả vị trí
     */
    private static int binarySearch(Books[] books, int x1) {
        int l = 0, r = books.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (books[m].getPrice() == x1)
                return m;
            if (books[m].getPrice() < x1)
                return l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    private static void InsertionSort(Books[] books) {
        var n = books.length;
        for (int i = 1; i < n; i++) {
            var x = books[i].getPrice();
            var j = i - 1;
            while (j >= 0 && x < books[0].getPrice()) {
            }
        }
    }

    /**
     * phương thức tìm kiếm giá sách trong thư viện
     *
     * @param books mảng chứa các quốn sách
     * @param x     Giá muốn tìm
     */
    private static void searPrice(Books[] books, int x) {
        for (Books book : books) {
            if (book.getPrice() == x) {
                System.out.println(book);
            }
        }

    }

//    private static void Binarysearch(Books[] books) {
//    }

    /**
     * Thuật toán sắp xếp nổi bọt
     *
     * @param books mảng books
     */
    private static void BubbleSort(Books[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = books.length - 1; j > i; j--) {
                if (books[j].getPrice() < books[j - 1].getPrice()) {
                    var temp = books[j];
                    books[j] = books[j - 1];
                    books[j - 1] = temp;
                }
            }
        }
    }

    /**
     * Phương thức tính tổng số tiền trong thư viện
     *
     * @param books mảng books
     */
    private static void totalMoney(Books[] books) {
        var total = 0;
        for (Books book : books) {
            total += book.getPrice();
        }
        System.out.println("Tong So Tien Trong Thu Vien la" + total);
    }

    /**
     * Phương thức đếm những quốn sách có tên Java
     *
     * @param books mảng books
     */
    private static void searNameJava(Books[] books) {
        var totalBookJava = 0;
        for (Books book : books) {
            if (book instanceof ProgrammingBooks) {
                ((ProgrammingBooks) book).getLanguage().equals("Java");
                totalBookJava++;
            }
        }
        System.out.println("Tong Thu Vien Co Sach Ten Java " + totalBookJava);
    }
}
