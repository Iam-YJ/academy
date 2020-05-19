//#include <stdio.h>
//#include <stdlib.h>
//#define EMPTY 0
//
//typedef struct node {
//    int data;
//    struct node* right;
//    struct node* left;
//} Tree;
//
//Tree* GetNode() {
//    Tree* tmp = (Tree*)malloc(sizeof(Tree));
//    tmp->right = EMPTY;
//    tmp->left = EMPTY;
//    return tmp;
//}
//
////45 27 17 62 57 73 52 65 76 69 63 64 71 tree insert
//
//void Insert(Tree** root, int data) {
//
//    if ((*root) == NULL) {
//        (*root) = GetNode();
//        (*root)->data = data;
//    }
//    else if ((*root)->data > data) {
//        Insert(&(*root)->left, data);
//    }
//    else {
//        Insert(&(*root)->right, data);
//    }
//
//}
//
////preorder a-b-c
//void Pre(Tree** root) {
//
//    if ((*root) == NULL) {
//        return;
//    }
//    printf("%d ", (*root)->data);
//    Pre(&(*root)->left);
//    Pre(&(*root)->right);
//
//}
//
////inorder b-a-c
//void In(Tree** root) {
//
//    if ((*root) != NULL) {
//        In(&(*root)->left);
//        printf("%d ", (*root)->data);
//        In(&(*root)->right);
//    }
//
//
//
//}
//
////postorder b-c-a-
//void Post(Tree** root) {
//
//    if ((*root) != NULL) {
//        Post(&(*root)->left);
//        Post(&(*root)->right);
//        printf("%d ", (*root)->data);
//    }
//    else {
//        return;
//    }
//
//}
//
//void DelLeaf(Tree** root, int data) {
//    Tree* tmp = *root;
//
//    if ((*root)->data == data) {
//        free(tmp);
//        (*root) = NULL;
//        return;
//    }
//    else if ((*root)->data > data) { //만약에 들어가는 data 가 node의 data 보다 작다면
//        DelLeaf(&(*root)->left, data);
//    }
//    else if ((*root)->data < data) {
//        DelLeaf(&(*root)->right, data);
//    }
//}
//
//void DelNode1(Tree** root, int data) {
//    Tree* tmp ;
//
//    if ((*root)->data == data) {
//        tmp = *root;
//        if ((*root)->left != NULL) {
//            *root = (*root)->left;
//        }
//        else if((*root)->right != NULL){
//            *root = (*root)->left;
//            free(tmp);
//        }
//    }
//    else {
//        if ((*root)->data > data) {
//            DelNode1(&(*root)->left, data);
//        }
//        else if ((*root)->data < data) {
//            DelNode1(&(*root)->right, data);
//        }
//    }
//
//}
//
//void Del() {
//
//}
//
//int main(void) {
//
//    int tree[] = { 45, 27, 17, 62, 57, 73, 52, 65, 76, 69, 63, 64, 71 };
//    int i;
//    Tree* root = EMPTY;
//
//    //삽입
//    for (i = 0; 0 < tree[i]; i++) {
//        Insert(&root, tree[i]);
//    }
//
//    //순회
//    printf("Pre 시작\n");
//    Pre(&root);
//    printf("\n");
//
//    //In(&root);
//    //printf("\n");
//
//    //Post(&root);
//    //printf("\n");
//
//    //삭제 
//    //case 1 - leaf 만
//    //DelLeaf(&root,17);
//    //DelLeaf(&root, 52);
//    //DelLeaf(&root, 64);
//    //DelLeaf(&root, 71);
//    //DelLeaf(&root, 76);
//
//    //printf("del 1 확인 \n");
//    //Pre(&root);
//    //printf("\n");
//
//    //case 2 - 노드가 하나 있을 때 
//    DelNode1(&root, 27);
//    printf("del 2 확인 \n");
//    Pre(&root);
//    printf("\n");
//
//    //case 3 - 
//
//
//    return 0;
//}
