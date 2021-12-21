package structural.adapter.case2;

public class AdapterEx {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
        //По сути реализуем интерфейс В, и определяем логику перехода данных из А в наш интерфейс
        private final ATable aTable;
        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        //Берем данные из А и заполняем ими В
        @Override
        public String getHeaderText() {
            return "[" + aTable.getCurrentUserName() + "] : " + aTable.getTableName();
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {

        String getHeaderText();
    }
}
