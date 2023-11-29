<script>
import Index from "./Index.vue";
import Login from "./Login.vue";
import NotFound from "./NotFound.vue";
import MarkDownEditor from "../public/article/MarkDownEditor.vue";

const routes = {
  '/': Index,
  '/login': Login,
  '/notFound': NotFound,
  '/markDownEditor': MarkDownEditor,
}

export default {
  data() {
    return {
      currentPath: window.location.hash
    }
  },
  computed: {
    currentView() {
      return routes[this.currentPath.slice(1) || '/'] || NotFound
    }
  },
  mounted() {
    window.addEventListener('hashchange', () => {
      this.currentPath = window.location.hash
    })
  }
}
</script>

<template>
  <a href="#/">Index</a>
  <a href="#/login">Login</a>
  <a href="#/notfound">NotFound</a>
  <a href="#/markDownEditor">MarkDownEditor</a>
  <component :is="currentView"/>
</template>

<style scoped>

</style>
