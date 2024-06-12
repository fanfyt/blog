<!-- 编辑文章页面-->
<template>
  <div class="edit-article">
    <Header />
    <h1>Edit Article</h1>
    <form @submit.prevent="submitArticle">
      <div>
        <label for="title">Title:</label>
        <input type="text" v-model="title" required />
      </div>
      <div>
        <label for="content">Content:</label>
        <textarea v-model="content" required></textarea>
      </div>
      <button type="submit">Save</button>
    </form>
    <Footer />
  </div>
</template>

<script>
import Header from '@/components/Header.vue';
import Footer from '@/components/Footer.vue';
import { mapActions } from 'vuex';

export default {
  name: 'EditArticle',
  components: {
    Header,
    Footer,
  },
  data() {
    return {
      title: '',
      content: '',
    };
  },
  methods: {
    ...mapActions('article', ['editArticle']),
    submitArticle() {
      const article = {
        title: this.title,
        content: this.content,
      };
      this.editArticle(article);
      // 这里你可以添加成功提示或者跳转到文章列表页
    },
  },
};
</script>

<style scoped>
.edit-article {
  text-align: center;
  padding: 20px;
}

.edit-article form {
  max-width: 600px;
  margin: 0 auto;
  text-align: left;
}

.edit-article label {
  display: block;
  margin-bottom: 5px;
}

.edit-article input,
.edit-article textarea {
  width: 100%;
  padding: 8px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.edit-article button {
  background-color: #42b983;
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  cursor: pointer;
  border-radius: 4px;
}

.edit-article button:hover {
  background-color: #333;
}
</style>
