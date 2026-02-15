class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode valeur = result;
        int retenue = 0;

        while (l1 != null || l2 != null || retenue != 0) {

            int somme = retenue;

            if (l1 != null) {
                somme += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                somme += l2.val;
                l2 = l2.next;
            }

            retenue = somme / 10;
            valeur.next = new ListNode(somme % 10);
            valeur = valeur.next;
        }
        return result.next;

    }
}